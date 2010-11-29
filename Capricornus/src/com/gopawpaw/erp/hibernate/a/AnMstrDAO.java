package com.gopawpaw.erp.hibernate.a;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * AnMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.a.AnMstr
 * @author MyEclipse Persistence Tools
 */

public class AnMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(AnMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(AnMstr transientInstance) {
		log.debug("saving AnMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AnMstr persistentInstance) {
		log.debug("deleting AnMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AnMstr findById(com.gopawpaw.erp.hibernate.a.AnMstrId id) {
		log.debug("getting AnMstr instance with id: " + id);
		try {
			AnMstr instance = (AnMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.a.AnMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AnMstr instance) {
		log.debug("finding AnMstr instance by example");
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
		log.debug("finding AnMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AnMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all AnMstr instances");
		try {
			String queryString = "from AnMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AnMstr merge(AnMstr detachedInstance) {
		log.debug("merging AnMstr instance");
		try {
			AnMstr result = (AnMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AnMstr instance) {
		log.debug("attaching dirty AnMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AnMstr instance) {
		log.debug("attaching clean AnMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static AnMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (AnMstrDAO) ctx.getBean("AnMstrDAO");
	}
}