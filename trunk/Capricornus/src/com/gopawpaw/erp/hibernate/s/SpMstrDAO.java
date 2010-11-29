package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SpMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SpMstr
 * @author MyEclipse Persistence Tools
 */

public class SpMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SpMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SpMstr transientInstance) {
		log.debug("saving SpMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SpMstr persistentInstance) {
		log.debug("deleting SpMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SpMstr findById(com.gopawpaw.erp.hibernate.s.SpMstrId id) {
		log.debug("getting SpMstr instance with id: " + id);
		try {
			SpMstr instance = (SpMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SpMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SpMstr instance) {
		log.debug("finding SpMstr instance by example");
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
		log.debug("finding SpMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SpMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SpMstr instances");
		try {
			String queryString = "from SpMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SpMstr merge(SpMstr detachedInstance) {
		log.debug("merging SpMstr instance");
		try {
			SpMstr result = (SpMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SpMstr instance) {
		log.debug("attaching dirty SpMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SpMstr instance) {
		log.debug("attaching clean SpMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SpMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SpMstrDAO) ctx.getBean("SpMstrDAO");
	}
}