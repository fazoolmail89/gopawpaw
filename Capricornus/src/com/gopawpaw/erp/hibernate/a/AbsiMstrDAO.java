package com.gopawpaw.erp.hibernate.a;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * AbsiMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.a.AbsiMstr
 * @author MyEclipse Persistence Tools
 */

public class AbsiMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(AbsiMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(AbsiMstr transientInstance) {
		log.debug("saving AbsiMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AbsiMstr persistentInstance) {
		log.debug("deleting AbsiMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AbsiMstr findById(com.gopawpaw.erp.hibernate.a.AbsiMstrId id) {
		log.debug("getting AbsiMstr instance with id: " + id);
		try {
			AbsiMstr instance = (AbsiMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.a.AbsiMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AbsiMstr instance) {
		log.debug("finding AbsiMstr instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding AbsiMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AbsiMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all AbsiMstr instances");
		try {
			String queryString = "from AbsiMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AbsiMstr merge(AbsiMstr detachedInstance) {
		log.debug("merging AbsiMstr instance");
		try {
			AbsiMstr result = (AbsiMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AbsiMstr instance) {
		log.debug("attaching dirty AbsiMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AbsiMstr instance) {
		log.debug("attaching clean AbsiMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static AbsiMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (AbsiMstrDAO) ctx.getBean("AbsiMstrDAO");
	}
}