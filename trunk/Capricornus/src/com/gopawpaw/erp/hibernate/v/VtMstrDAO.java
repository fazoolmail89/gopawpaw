package com.gopawpaw.erp.hibernate.v;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * VtMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.v.VtMstr
 * @author MyEclipse Persistence Tools
 */

public class VtMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(VtMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(VtMstr transientInstance) {
		log.debug("saving VtMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(VtMstr persistentInstance) {
		log.debug("deleting VtMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public VtMstr findById(com.gopawpaw.erp.hibernate.v.VtMstrId id) {
		log.debug("getting VtMstr instance with id: " + id);
		try {
			VtMstr instance = (VtMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.v.VtMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(VtMstr instance) {
		log.debug("finding VtMstr instance by example");
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
		log.debug("finding VtMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from VtMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all VtMstr instances");
		try {
			String queryString = "from VtMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public VtMstr merge(VtMstr detachedInstance) {
		log.debug("merging VtMstr instance");
		try {
			VtMstr result = (VtMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(VtMstr instance) {
		log.debug("attaching dirty VtMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(VtMstr instance) {
		log.debug("attaching clean VtMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static VtMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (VtMstrDAO) ctx.getBean("VtMstrDAO");
	}
}